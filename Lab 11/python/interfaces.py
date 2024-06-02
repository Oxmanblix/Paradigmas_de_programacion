from abc import ABC, abstractmethod
import math

class Figure(ABC):
    
    @abstractmethod
    def Perimetro(self):
        pass
    
    @abstractmethod
    def Area(self):
        pass
    
    def getColor(self):
        return self.Color
    
class Triangulo(Figure):
    def __init__(self,Color,base,altura):
        self.Color=Color
        self.base=base
        self.altura=altura
        
    def Perimetro(self):
        return ( 2*(math.sqrt(math.pow(self.base/2,2) + math.pow(self.altura, 2)))+self.base)
    
    def Area(self):
        return (self.base*self.altura)/2
    
    def getColor(self):
        return self.Color
    
class Circulo(Figure):
    def __init__(self,Color,radio):
        self.Color=Color
        self.radio=radio
        
    def Perimetro(self):
        return math.pi*2*self.radio  
    
    def Area(self):
        return math.pi*self.radio*self.radio 
    
    def getColor(self):
        return self.Color
    
class Rectangulo(Figure):
    def __init__(self, Color,base,altura):
        self.Color=Color
        self.base=base
        self.altura=altura 
        
    def Perimetro(self):
        return (self.base*2)+(self.altura*2)
    
    def Area(self):
        return self.base*self.altura
    
    def getColor(self):
        return self.Color
    
class Hexagono(Figure):
    def __init__(self, Color,lado,apotema):
        self.Color=Color
        self.lado=lado
        self.apotema=apotema
    
    def Perimetro(self):
        return self.lado*6
    
    def Area(self):
        return self.Perimetro()*self.apotema
    
    def getColor(self):
        return self.Color
    
Trian1=Triangulo("Rojo",5,8)
Circ1=Circulo("Azul",5)
Rec1=Rectangulo("Rosa",7,9.7)
Hex1=Hexagono("Gris",7.64,3)  

figuras=[Trian1,Circ1,Rec1,Hex1]

for figura in figuras:
    print(f"Color: {figura.getColor()}")
    print(f"Perimetro: {figura.Perimetro()}")
    print(f"Area: {figura.Area()}")
    print()