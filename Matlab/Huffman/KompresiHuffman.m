clc; clear; close all;warning off all;

Img = imread('lenC.jpg');
%figure,imshow(I);
%Img = rgb2gray(I);
figure,imshow(Img);
[m,n] = size(Img);
Img1 = Img(:);

symbol = [];
count = [];

j = 1;
for i = 1:length(Img1)
    flag = 0;
    
    flag = ismember(symbol, Img1(i));
    if sum(flag) == 0
        symbol(j) = Img1(i);
        k = ismember(Img1, Img1(i));
        c = sum(k);
        count(j) = c;
        j = j + 1;
    end
end

total = sum(count);

prob = [];
for i = 1:size((count)')
    prob(i) = count(i)/total;
end

[dict, avglen] = huffmandict(symbol,prob);

comp = huffmanenco(Img1,dict);

im = huffmandeco(comp,dict);
im1 = uint8(im);

decomp = reshape(im1,m,n);
%figure,imshow(decomp);
figure,imshow(decomp);title('Kompresi');
imwrite(decomp, 'lenC.jpg');