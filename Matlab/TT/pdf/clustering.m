img = imread('tt3.jpg');
img = imresize(img,0.5);
[mu,mask] = kmeans(img,8);
B = labeloverlay(img,mask);
imshow(B)

wavelength = 2.^(0:5) * 3;
orientation = 0:45:135;
g = gabor(wavelength,orientation);

I = im2single(img);

gabormag = imgaborfilt(I,g);
montage(gabormag,'Size',[4 6])