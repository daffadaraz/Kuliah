import os, sys, time, datetime
from datetime import date

def newline(t):
    for _ in range(0,t):
        print('<br />')

# Assignment
tgljadi = date(2017,4,22)
today = date.today()
lamaHari = today - tgljadi
tahun = lamaHari.days/365
bulan = lamaHari.days/30
bulantahun = bulan % 12
jam = lamaHari.days * 24
menit = jam * 60

# Output
print("Daffa dan Ratu!")
newline(1)
print("Tanggal Jadi :", tgljadi)
newline(1)
print("Sekarang     :", today)
newline(2)
print("Sudah ",('%d' % tahun)," Tahun dan ",('%d'% bulantahun)," Bulan")
newline(2)
print("Atau")
newline(1)
print(('%.2f' % bulan)," Bulan")
newline(1)
print(lamaHari.days," Hari")
newline(1)
print(jam," Jam")
newline(1)
print(jam*60," Menit")
