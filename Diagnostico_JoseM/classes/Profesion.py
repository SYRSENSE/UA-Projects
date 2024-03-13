from classes.Persona import Persona

class Profesion(Persona):
    def __init__(self, nombre="", edad=0, sexo="", profesion ="", sueldo = 0.0):
        super().__init__(nombre, edad, sexo)
        self.__profesion = profesion
        self.__sueldo = sueldo
    def get_profesion(self):
        return self.__profesion
    def get_sueldo(self):
        return self.__sueldo
    def set_profesion(self, cambio):
        self.__profesion = cambio
    def set_sueldo(self, cambio):
        self.__sueldo = cambio