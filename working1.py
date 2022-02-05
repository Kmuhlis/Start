bLt = 6   # benzin lt fiyat
aKm = 0.06  # araba km lt tüketimi
# başlangıç kırıkkale
gidilenSehir = "Konya"
nazilliKm = 650
ankaraKm = 80
istanbulKm = 630
karabukKm = 240
sakaryaKm = 420
yozgatKm = 120

nazilliLt = 650 * aKm
ankaraLt = 80 * aKm
istanbulLt = 630 * aKm
karabukLt = 240 * aKm
sakaryaLt = 420 * aKm
yozgatLt = 120 * aKm

nazilli = nazilliLt * bLt
ankara = ankaraLt * bLt
istanbul = istanbulLt * bLt
karabuk = karabukLt * bLt
sakarya = sakaryaLt * bLt
yozgat = yozgatLt * bLt

print(gidilenSehir," nazilli yakıt tüketimi:",nazilliLt,"lt","ve toplam tutar:", nazilli,"TL")
print(gidilenSehir," ankara yakıt tüketimi:",ankaraLt,"lt","ve toplam tutar:", ankara,"TL")
print(gidilenSehir," istanbul yakıt tüketimi:",istanbulLt,"lt","ve toplam tutar:", istanbul,"TL")
print(gidilenSehir," karabük yakıt tüketimi:",karabukLt,"lt","ve toplam tutar:", karabuk,"TL")
print(gidilenSehir," sakarya yakıt tüketimi:",sakaryaLt,"lt","ve toplam tutar:", sakarya,"TL")
print(gidilenSehir," yozgat yakıt tüketimi:",yozgatLt,"lt","ve toplam tutar:", yozgat,"TL")
