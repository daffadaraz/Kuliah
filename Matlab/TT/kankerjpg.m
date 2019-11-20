file = 'tt3.jpg';

% membaca citra
asli = imread(file);
[rowa, cola, ~] = size(asli);
img = imcrop(asli,[0 2 rowa-1 cola]);
L = imbinarize(img,0.1);

[imgc,props] = filtering(L,1);
%imgc = imcrop(asli, props.BoundingBox);

Canc = im2bw(img,0.7);

[thresh,propt,statt] = filtering(Canc,1);
thresh = bwareafilt(thresh,1);

%imgc = imcrop(asli, props.BoundingBox);
CancAsli = imgc;
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

out1 = imcrop(img, [xmin1 ymin1 width1 height1]);


subplot(2,2,1), imshow(img), title('Asli');
subplot(2,2,2), imshow(immultiply(imgc,thresh)), title('Cancer');
subplot(2,2,3), imshow(img), 

[labeled, numObjects] = bwlabel(thresh,8);
stats = regionprops(labeled,'BoundingBox');
bbox = cat(1, stats.BoundingBox);

for idx = 1 : numObjects
    h = rectangle('Position',bbox(idx,:),'Linewidth',2);
    set(h,'EdgeColor',[.75 0 0]);
    hold on;    
end

title('Detect');

subplot(2,2,4), imshow(out1), title('ROI');
