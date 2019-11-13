clc; clear; close all; warning off all;

rgbImage = imread('buah.jpg');
[rows, columns, numberOfColorBands] = size(rgbImage);
subplot(2, 2, 1);
imshow(rgbImage, []);
set(gcf, 'Position', get(0,'Screensize'));
redPlane = rgbImage(:, :, 1);
greenPlane = rgbImage(:, :, 2);
bluePlane = rgbImage(:, :, 3);

[pixelCountR, grayLevelsR] = imhist(redPlane);
subplot(2,2,2);
bar(pixelCountR, 'r');
xlim([0, grayLevelsR(end)]);

[pixelCountG, grayLevelsG] = imhist(greenPlane);
subplot(2, 2, 3);
bar(pixelCountG, 'g');
xlim([0, grayLevelsG(end)]);

[pixelCountB, grayLevelsB] = imhist(bluePlane);
subplot(2, 2, 4);
bar(pixelCountB, 'b');
xlim([0, grayLevelsB(end)]);
