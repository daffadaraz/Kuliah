clc; clear; close all; warning off all;

% membaca citra
asli = imread('tt2.jpg');
[rowa, cola, ~] = size(asli);
img = imcrop(asli,[0 2 rowa-1 cola]);
[rows, columns, numberOfColorChannels] = size(img);
%figure,imshow(img);
L = imbinarize(img,0.1);

% melakukan morfologi
M = imfill(L,'holes');
N = bwareaopen(M,100);

% mengambil bounding box masing2 objek hasil segmentasi
[labeled, numObjects] = bwlabel(N,8);
stats = regionprops(labeled,'BoundingBox');

%Filter ukuran terbesar
T = bwareafilt(M,1);
T = imfill(T, 'holes');
props = regionprops(T, 'BoundingBox');

%Blur
windowWidth = 25;
blurredImage = conv2(double(T), ones(windowWidth)/windowWidth^2, 'same');
%Blur > Binary
T = blurredImage > 0.5;

%Filter di gambar asli
imgc = img;
for ro = 1:rows-1
    for col = 1:columns-1
        if T(ro,col) == 0
            imgc(ro,col) = 0;
        end
    end
end

%crop sesuai dengan yang nilainya 1
imgc = imcrop(imgc, props.BoundingBox);

thresh = filtering(im2bw(imread('tt3.jpg'),0.8));

subplot(2,2,1), imshow(asli), title('Asli');
subplot(2,2,2), imshow(T), title('Binary');
subplot(2,2,3), imshow(imgc), title('Filtered & Cropped');
subplot(2,2,4), imshow(thresh), title('Threshold');

