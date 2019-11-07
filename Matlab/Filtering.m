I = imnoise(rgb2gray(imread('3.jpg')),'salt & pepper');
SxSobel = [ -1 0 1 ; -2 0 2; -1 0 1];
SySobel = [ 1 2 1 ; 0 0 0 ; -1 -2 -1];
sobelSx = conv2(I, SxSobel);
sobelSy = conv2(I, SySobel);
sobel = abs(sobelSx) + abs(sobelSy);

LapX = [ -1 -1 -1 ; -1 8 -1 ; -1 -1 -1];
LapY = [ 1 1 1 ; 0 0 0 ; -1 -1 -1];
laplaceX = conv2(I, LapX);
laplaceY = conv2(I, LapY);
laplace = abs(laplaceX) + abs(laplaceY);

robX = [ 1 0 ; 0 -1];
robY = [ 0 1 ; -1 0];
robertX = conv2(I, robX);
robertY = conv2(I, robY);
roberts = abs(robertX) + abs(robertY);

perX = [ -1 0 1 ; -1 0 1; -1 0 1];
perY = [ 1 1 1 ; 0 0 0 ; -1 -1 -1];
perwitX = conv2(I, perX);
perwitY = conv2(I, perY);
perwitt = abs(perwitX) + abs(perwitY);

Canny = edge(I,'canny');

low = [ 1/9 1/9 1/9 ; 1/9 1/9 1/9 ; 1/9 1/9 1/9];
lowPass = conv2(I, low);

Hi = [ -1 -1 -1 ; -1 8 -1 ; -1 -1 -1];
HiPass = conv2(I, Hi);

subplot(3,3,1), imshow(I);title('Asli');
subplot(3,3,2), imshow(uint8(sobel));title('Sobel');
subplot(3,3,3), imshow(uint8(laplace));title('Laplace');
subplot(3,3,4), imshow(uint8(roberts));title('Roberts');
subplot(3,3,5), imshow(uint8(perwitt));title('Perwitt');
subplot(3,3,6), imshow(Canny);title('Canny');
subplot(3,3,7), imshow(uint8(lowPass));title('LowPass');
subplot(3,3,8), imshow(uint8(HiPass));title('HighPass');
subplot(3,3,9), imshow(medfilt2(I));title('Median (Best for Noise)');

