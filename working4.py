# Araba yakıt tüketimi hesaplaması 

ş = input("Gitmek istediğiniz şehir: ")
m = float(input("Gidilecek olan şehre uzaklık: "))
yT = float(input("Aracınızın yakıt tüketimi(Lt/Km): "))
yF = float(input("Güncel yakıt fiyatı: "))

yakıtLt = yT * m
tutarTl = yakıtLt * yF

print(ş,"iline giderken",yakıtLt,"litre yakıt tüketimi olur ve ücreti:", tutarTl, "Tl tutar.")