class Persona():
    def __init__(self, nombre = "",edad = 0,sexo = ""):
        self.__nombre = nombre
        self.__edad = edad
        self.__sexo = sexo
    def get_nombre(self):
        return self.__nombre
    def get_edad(self):
        return self.__edad
    def get_sexo(self):
        return self.__sexo
    def set_nombre(self, cambio):
        self.__nombre = cambio
    def set_edad(self, cambio):
        self.__edad = cambio
    def set_sexo(self, cambio):
        self.__sexo = cambio