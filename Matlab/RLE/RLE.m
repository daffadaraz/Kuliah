file = 'lenna.jpg';
I = rgb2gray(imread(file));
B = imbinarize(I);
R = zeros(size(B,1),size(B,2));

%encode
for row = 1:size(B,1)-1
    i = 1;
    for col = 1:size(B,2)-1
        if B(row,col) == B(row,col+1)
            R(row,i) = R(row,i) + 1;
        else
            R(row,i) = R(row,i) + 1;
            i = i + 1;
            R(row,i) = B(row,col);
            i = i + 1;
        end
    end
end

%decode
D = zeros(size(R,1),size(R,2));

for row = 1:size(B,1)-1
    tempcol = 1;
    for col = 1:size(B,2)-1
        if mod(col,2) ~= 0
            value = R(row,col+1);
            for a = 1:R(row,col)
                D(row,tempcol) = value;
                tempcol = tempcol + 1;
            end
        end
    end
end

imwrite(B,'Binary.jpeg','JPEG');
imwrite(R,'Compressed.jpeg','JPEG');
imwrite(D,'Decompressed.jpeg','JPEG');

Is = imfinfo(file);
Rs = imfinfo('Compressed.jpeg');
Ds = imfinfo('Decompressed.jpeg');
Bs = imfinfo('Binary.jpeg');

subplot(2,2,1), imshow(I);title(strcat('Asli (',string(Is.FileSize/1024),' KB)'));
subplot(2,2,2), imshow(B);title(strcat('Binary (',string(Bs.FileSize/1024),' KB)'));
subplot(2,2,3), imshow(R);title(strcat('Compressed (',string(Rs.FileSize/1024),' KB)'));
subplot(2,2,4), imshow(D);title(strcat('Decompressed (',string(Ds.FileSize/1024),' KB)'));


