I = im2double(imread('medtest.png'));
x = 229; y = 224;
J = regiongrowing(I,x,y,0.2);
subplot(1,3,1), imshow(I);
subplot(1,3,2), imshow(J);
subplot(1,3,3), imshow(I+J);
