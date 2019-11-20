function [imgc,props,stats]=filtering(img,many)

[rows, columns, ~] = size(img);

% melakukan morfologi
M = imfill(img,'holes');
N = bwareaopen(M,100);

% mengambil bounding box masing2 objek hasil segmentasi
[labeled, ~] = bwlabel(N,8);
stats = regionprops(labeled,'BoundingBox');

%Filter ukuran terbesar
T = bwareafilt(M,many);
T = imfill(T, 'holes');
props = regionprops(T, 'BoundingBox');

%Blur
windowWidth = 25;
blurredImage = conv2(double(T), ones(windowWidth)/windowWidth^2, 'same');
%Blur > Binary
T = blurredImage > 0.5;

%Filter di gambar asli
imgc = img;
for ro = 1:rows-1
    for col = 1:columns-1
        if T(ro,col) == 0
            imgc(ro,col) = 0;
        end
    end
end

%crop sesuai dengan yang nilainya 1

end