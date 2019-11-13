a = rgb2gray(imread('3.jpg'));
c = graycomatrix(a,'Offset',[0 1]);
b = histeq(a);
d = graycomatrix(b,'Offset',[0 1]);

statsa = graycoprops(c);
statsb = graycoprops(d);
fitura = [statsa.Contrast; statsa.Correlation; statsa.Energy; statsa.Homogeneity];
fiturb = [statsb.Contrast; statsb.Correlation; statsb.Energy; statsb.Homogeneity];
fitura
fiturb

subplot(2,2,1); imshow(a); title('Asli');
subplot(2,2,2); imhist(a); title('Histogram Asli');
subplot(2,2,3); imshow(b); title('Equalized');
subplot(2,2,4); imhist(b); title('Histogram Equalized');