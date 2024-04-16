'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
class Persona:
    def __init__(self, nombre, edad, peso, estatura, nacionalidad, telefono, ocupacion):
        self.nombre = nombre
        self.edad = edad 
        self.peso = peso
        self.estatura = estatura 
        self.nacionalidad = nacionalidad 
        self.telefono = telefono 
        self.ocupacion = ocupacion

  #  def saludar(self):
   #     for i in range(self.veces):
    #        print(f'Hola{self.nombre}')

    #def __str__(self):
     #   return f'Nombre {self.nombre} y veces {self.veces}'
    
    def display_info(self):
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad}")
        print(f"Peso: {self.peso} Kg")
        print(f"Estatura: {self.estatura} m")
        print(f"Nacionalidad: {self.nacionalidad}")
        print(f"Telefono: {self.telefono}")
        print(f"Ocupación: {self.ocupacion}")

persona1 = Persona("Mario",25,78,1.78,"Inglés","5568512357","Fontanero")
persona1.display_info()
print("\n")
persona2 = Persona("Lucía",20,57,1.67,"Española",5565479979,"Exploradora")
persona2.display_info()
#persona1.saludar()
#print(persona1)