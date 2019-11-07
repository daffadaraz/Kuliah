clc; clear; close all; warning off all;

% membaca citra rgb
img = imread('3.jpg');
%figure,imshow(img);

% grayscale
I = double(rgb2gray(img));
%figure, imshow(I,[]);

% Konvolusi dengan operator Roberts
robertshor = [0 1;-1 0];
robertsver = [1 0;0 -1];
Ix = conv2(I, robertshor);
Iy = conv2(I, robertsver);
J = sqrt((Ix.^2)+(Iy.^2));

% Menampilkan citra hasil konvolusi
% figure,imshow(Ix,[]);
% figure,imshow(Iy,[]);
% figure,imshow(J,[]);

% melakukan tresholding
K = uint8(J);
L = imbinarize(K,.08);

% melakukan morfologi
M = imfill(L,'holes');
N = bwareaopen(M,10000);

% mengambil bounding box masing2 objek hasil segmentasi
[labeled, numObjects] = bwlabel(N,8);
stats = regionprops(labeled,'BoundingBox');
bbox = cat(1, stats.BoundingBox);

subplot(2,4,1), imshow(img);title('Asli');
subplot(2,4,2), imshow(uint8(I));title('GrayScale');
subplot(2,4,3), imshow(Ix,[]);title('Convolusi Robert X');
subplot(2,4,4), imshow(Iy,[]);title('Convolusi Robert Y');
subplot(2,4,5), imshow(L,[]);title('Binary');
subplot(2,4,6), imshow(N,[]);title('Morfologi');
subplot(2,4,7), 

imshow(img);
hold on;
for idx = 1 : numObjects
    h = rectangle('Position',bbox(idx,:),'Linewidth',2);
    set(h,'EdgeColor',[.75 0 0]);
    hold on;
end

% menampilkan jumlah objek hasil segmentasi
title(['There are ', num2str(numObjects),...
    ' objects in the image!']);
hold on;
