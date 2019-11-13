clear;

a = imread('lenna.jpg');
[p l d] = size(a);
geserx = 250;
gesery = 50;
for i=1:p
    for j=1:l
        for k=1:d
            new(i+geserx,j+gesery,k) = a(i,j,k);
        end
    end
end
subplot(1,2,1), imshow(a), title('Asli');
subplot(1,2,2), imshow(new), title('Translasi');
