b=dicomread('crop_14S0RMLOanon2502.dcm');
Max=double(max(max(b)));
asli=uint8(double(b(:,:))*255/Max);   % konversi nilai citra dicom 16 bit ke 8 bit

[rowa, cola, ~] = size(asli);
img = asli;
%img = imcrop(asli,[0 2 rowa cola]);
L = imbinarize(img,0.1);


%[imgc,props] = filtering(L);
%imgc = imcrop(asli, props.BoundingBox);
imgc = img;

Canc = im2bw(imgc,0.7);

[thresh,propt] = filtering(Canc);
%thresh = bwareafilt(thresh,1);

%imgc = imcrop(asli, props.BoundingBox);
CancAsli = imgc;
threshp = imcrop(CancAsli, thresh);
%threshp = imcrop(CancAsli, propt.BoundingBox);

subplot(2,3,1), imshow(img), title('Asli');
subplot(2,3,2), imshow(L), title('Binary');
subplot(2,3,3), imshow(imgc), 

[labeled, numObjects] = bwlabel(thresh,8);
stats = regionprops(labeled,'BoundingBox');
bbox = cat(1, stats.BoundingBox);

for idx = 1 : numObjects
    h = rectangle('Position',bbox(idx,:),'Linewidth',2);
    set(h,'EdgeColor',[.75 0 0]);
    hold on;    
end

title('Filtered, Cropped, Detect');

subplot(2,3,4), imshow(thresh), title('Cancer');
subplot(2,3,5), imshow(immultiply(imgc,thresh)), title('Cancer');
subplot(2,3,6), imshow(threshp), title('ROI');
