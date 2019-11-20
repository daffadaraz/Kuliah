file = 'mdb011fatt.jpg';

% membaca citra
asli = imread(file);
[rowa, cola, ~] = size(asli);
img = imcrop(asli,[0 2 rowa-1 cola]);
L = imbinarize(img,0.1);

[imgc, ~, ~] = filtering(L,1);  

notext = immultiply(imgc,img);

[y1,x1] = find(imgc); %// Find row and column locations that are non-zero

%// Find top left corner
xmin1 = min(x1(:));
ymin1 = min(y1(:));

%// Find bottom right corner
xmax1 = max(x1(:));
ymax1 = max(y1(:));

%// Find width and height
width1 = xmax1 - xmin1 + 1;
height1 = ymax1 - ymin1 + 1;

out1 = imcrop(notext, [xmin1 ymin1 width1 height1]);


subplot(1,3,1), imshow(img), title('Asli');
subplot(1,3,2), imshow(notext), title('Crop Text');
subplot(1,3,3), imshow(out1), title('ROI');

imwrite(out1,'Output.jpg')
