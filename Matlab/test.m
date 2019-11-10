I = rgb2gray(imread('lenna.jpg'));
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
D = zeros(size(B,1),size(B,2));

for row = 1:size(B,1)-1
    tempcol = 1;
    for col = 1:size(B,2)-1
        if mod(col,2) ~= 0
            value = R(row,col+1);
            for a = 1:R(row,col)
                D(row,tempcol) = value;
                tempcol = tempcol + 1;
            end
        elseif tempcol == size(B,2)
            continue;
        end
    end
end

subplot(2,2,1), imshow(I);title('Asli');
subplot(2,2,2), imshow(B);title('Binary');
subplot(2,2,3), imshow(R);title('Compressed');
subplot(2,2,4), imshow(D);title('Decompressed');

imwrite(B,'Binary.jpeg','JPEG');
imwrite(R,'Compressed.jpeg','JPEG');
imwrite(D,'Decompressed.jpeg','JPEG');


