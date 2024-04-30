
class Hexagono_regular:
    def __init__(self,lado,apotema,color):
        self.__lado=lado
        self.__apotema=apotema
        self.__color=color
        
    def getPerimetro(self):
        return self.__calcularPerimetro()
        
    def __calcularPerimetro(self):
        return (self.__lado*6)
        
    def getArea(self):
        return self.__calcularArea()
        
    def __calcularArea(self):
        return ((self.__lado*6)*(self.__apotema))/2
    
    def getColor(self):
        print(f'\nMetodo getColor       Color:{self.__color}') 
        
    def Info(self):
        print(f'\nHexagono\nlado: {self.__lado} cm \napotema: {self.__apotema} cm\ncolor: {self.__color}')

class Rombo:
    def __init__(self,lado,mayor,menor,color):
        self.__lado=lado
        self.__mayor=mayor
        self.__menor=menor
        self.__color=color
        
    def __calcularPerimetro(self):
        return (self.__lado*4)
    
    def getPerimetro(self):
        return self.__calcularPerimetro()
        
    def __calcularArea(self):
        return (self.__mayor*self.__menor)/2
        
    def getArea(self):
        return self.__calcularArea()
        
    def getColor(self):
        print(f'\nMetodo getColor       Color:{self.__color}') 
        
    def Info(self):
        print(f'\nRombo\nLado: {self.__lado} cm, Diagonal mayor: {self.__mayor} cm, Diagonal menor: {self.__menor} cm\nColor: {self.__color}')

class Trapecio:
    def __init__(self,mayor,menor,lados,altura,color):
        self.__mayor=mayor
        self.__menor=menor
        self.__lados=lados
        self.__altura=altura
        self.__color=color
        
    def __calcularPerimetro(self):
        return self.__mayor+self.__menor+(self.__lados*2)
    
    def getPerimetro(self):
        return self.__calcularPerimetro()
        
    def __calcularArea(self):
        return ((self.__mayor+self.__menor)*self.__altura)/2
    
    def getArea(self):
        return self.__calcularArea()
    
    def getColor(self):
        print(f'\nMetodo getColor       Color:{self.__color}') 
        
    def Info(self):
        print(f'\nTrapecio\nBase mayor: {self.__mayor}cm, Base menor: {self.__menor}cm, Altura: {self.__altura}cm\nColor: {self.__color}')

#Hexagono
        
hexa1=Hexagono_regular(10,9,'Morado')
hexa1.Info()
Perimetro=hexa1.getPerimetro()
Area=hexa1.getArea()
hexa1.getColor()
print('El perimetro del hexagono es: ',Perimetro,'cm\nEl area del hexagono es: ',Area,'cm^2')

#Rombo

romb1=Rombo(5,8,6,'blanco')
romb1.Info()
Perimetro=romb1.getPerimetro()
Area=romb1.getArea()
romb1.getColor()
print('El perimetro del rombo es: ',Perimetro,'cm\nEl area del rombo es: ',Area,'cm^2')

#Trapecio

trap1=Trapecio(5,2,3.2,3,'naranja')
trap1.Info()
Perimetro=trap1.getPerimetro()
Area=trap1.getArea()
trap1.getColor()
print('El perimetro del trapecio es: ',Perimetro,'cm\nEl area del trapecio es: ',Area,'cm^2')




