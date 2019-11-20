filename = input('NamaFile: ','s');
thresho = input('Threshold (0.65) [0-1] : ');
jumlah = input('Sensitivity (1..3) : ');

b=dicomread(filename);

Max=double(max(max(b)));
asli=uint8(double(b(:,:))*255/Max);   % konversi nilai citra dicom 16 bit ke 8 bit

Canc = imbinarize(asli,thresho);

[thresh,propt,statt] = filtering(Canc,jumlah);

CancAsli = asli;
threshp = imcrop(CancAsli, propt.BoundingBox);

[y1,x1] = find(thresh); %// Find row and column locations that are non-zero

%// Find top left corner
xmin1 = min(x1(:));
ymin1 = min(y1(:));

%// Find bottom right corner
xmax1 = max(x1(:));
ymax1 = max(y1(:));

%// Find width and height
width1 = xmax1 - xmin1 + 1;
height1 = ymax1 - ymin1 + 1;

out1 = imcrop(asli, [xmin1 ymin1 width1 height1]);

subplot(2,2,1), imshow(asli), title('Asli');
subplot(2,2,2), imshow(immultiply(asli,thresh)), title('Cancer');
subplot(2,2,3), imshow(asli), 

[labeled, numObjects] = bwlabel(thresh,8);
stats = regionprops(labeled,'BoundingBox');
bbox = cat(1, stats.BoundingBox);

for idx = 1 : numObjects
    h = rectangle('Position',bbox(idx,:),'Linewidth',2);
    set(h,'EdgeColor',[.75 0 0]);
    hold on;    
end

title('Box');

subplot(2,2,4), imshow(out1), title('ROI');

imwrite(out1,'Output.jpg')
