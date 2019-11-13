clear; clc; close all;

file = 'cameraman.jpg'; 
Asli = rgb2gray(imread(file));
%Asli = [1 1 0; 0 1 0; 0 1 1];
%Asli = ones(50,50);
Biner = imbinarize(Asli);

%Sesuaiin ukuran matrix genap/ganjil.
x = 1;
y = 1;
if mod(size(Asli,1),2) == 0
    x = 2;
end
if mod(size(Asli,2),2) == 0
    y = 2;
end
Compressed = zeros(size(Asli,1)+x,size(Asli,2)+y);

%encode
for row = 1:size(Biner,1)
    i = 1;
    for col = 1:size(Biner,2)
        if col ~= size(Biner,2)
            if Biner(row,col) == Biner(row,col+1)
                Compressed(row,i) = Compressed(row,i) + 1;
            else
                Compressed(row,i) = Compressed(row,i) + 1;
                i = i + 1;
                Compressed(row,i) = Biner(row,col);
                i = i + 1;
            end
        elseif col == size(Biner,2) && Biner(row,col) == Biner(row,col-1)
            Compressed(row,i) = Compressed(row,i) + 1;
            i = i + 1;
            Compressed(row,i) = Biner(row,col);
            i = i + 1;
        else 
            Compressed(row,i) = 1;
            i = i + 1;
            Compressed(row,i) = Biner(row,col);
            i = i + 1;
        end
    end
    i = 1;
end

%decode
Decompressed = zeros(size(Asli,1),size(Asli,2));

for row = 1:size(Compressed,1)
    tempcol = 1;
    for col = 1:size(Compressed,2)
        if mod(col,2) ~= 0
            value = Compressed(row,col+1);
            for a = 1:Compressed(row,col)
                Decompressed(row,tempcol) = value;
                tempcol = tempcol + 1;
            end
        end
    end
end

imwrite(Asli,'Asli.jpeg','JPEG');
imwrite(Biner,'Binary.jpeg','JPEG');
imwrite(Compressed,'Compressed.jpeg','JPEG');
imwrite(Decompressed,'Decompressed.jpeg','JPEG');

Is = imfinfo('Asli.jpeg');
Rs = imfinfo('Compressed.jpeg');
Ds = imfinfo('Decompressed.jpeg');
Bs = imfinfo('Binary.jpeg');

subplot(2,2,1), imshow(Asli);title(strcat('Asli (',string(Is.FileSize/1024),' KB)'));
subplot(2,2,2), imshow(Biner);title(strcat('Binary (',string(Bs.FileSize/1024),' KB)'));
subplot(2,2,3), imshow(Compressed);title(strcat('Compressed (',string(Rs.FileSize/1024),' KB)'));
subplot(2,2,4), imshow(Decompressed);title(strcat('Decompressed (',string(Ds.FileSize/1024),' KB)'));


