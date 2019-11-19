clc;
clear all;
close all;
text1 = [50 100 100 50 100 50 100 0 50 100 150 100 200 100 100 50];
Symbol = [];
count = [];

j = 1;
for i = 1:length(text1)
    flag = 0;
    
    flag = ismember(Symbol, text1(i));
    if sum(flag) == 0
        Symbol(j) = text1(i);
        k = ismember(text1, text1(i));
        c = sum(k);
        count(j) = c;
        j = j + 1;
    end
end

total = sum(count);
%count = sort(count, 'descend');
prob = [];
for i = 1:size((count)')
    prob(i) = count(i)/total;
end

dict = huffmandict(Symbol,prob);
temp=dict;
for i=1: length(temp)
    temp {i,2}= num2str(temp{i,2});
end
disp(temp);
hcode= huffmanenco(Symbol,dict)
dhsig= huffmandeco(hcode, dict)