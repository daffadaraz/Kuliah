b=dicomread('crop_14S0RMLOanon2502.dcm');
Max=double(max(max(b)));
asli=uint8(double(b(:,:))*255/Max);
[rows, columns, ~] = size(asli);

L = imbinarize(asli,0.7);

M = imfill(L,'holes');
N = bwareaopen(M,100);

T = bwareafilt(M,4);
imshow(T);