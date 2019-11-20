clc;clear;close all;warning off all;

%Img = imread('tt4.jpg');
Img = dicomread('crop_14S0RMLOanon2502.dcm');
figure,imshow(Img);

I = medfilt2(Img);

T = graythresh(I);

BW = imbinarize(I,T);
figure,imshow(BW)

M = imfill(BW,'holes');
N = bwareaopen(M,1000);
figure, imshow(N,[]);

%Z = immultiply(Img,N);
%5figure,imshow(Z);

%X = edge (Z,'canny');
%figure,imshow(X);

[y,x] = find(N); %// Find row and column locations that are non-zero

%// Find top left corner
xmin = min(x(:));
ymin = min(y(:));

%// Find bottom right corner
xmax = max(x(:));
ymax = max(y(:));

%// Find width and height
width = xmax - xmin + 1;
height = ymax - ymin + 1;

out = imcrop(Img, [xmin ymin width height]);
figure,imshow(out);

xx = uint8(out);
ll = im2bw(xx, 0.8);
figure,imshow(ll,[]);

median = medfilt2(ll);
figure,imshow(median);

R = imfill(median,'holes');
RR = bwareaopen(R,1000);
figure,imshow(RR,[]);

[labeled, numObjects] = bwlabel(RR,8);
stats = regionprops(labeled,'BoundingBox');
bbox = cat(1, stats.BoundingBox);

figure, imshow(Img);
hold on;
for idx = 1 : numObjects
    h = rectangle('Position',bbox(idx,:),'LineWidth',2);
    set(h,'EdgeColor',[.75 0 0]);
    hold on;
end

[y1,x1] = find(RR); %// Find row and column locations that are non-zero

%// Find top left corner
xmin1 = min(x1(:));
ymin1 = min(y1(:));

%// Find bottom right corner
xmax1 = max(x1(:));
ymax1 = max(y1(:));

%// Find width and height
width1 = xmax1 - xmin1 + 1;
height1 = ymax1 - ymin1 + 1;

out1 = imcrop(Img, [xmin1 ymin1 width1 height1]);
figure,imshow(out1);