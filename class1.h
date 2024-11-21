#ifndef CLASS1_H
#define CLASS1_H
#include <string>
#include <iostream>

class Gato {
private:
    std::string nombre;

public:
    Gato(std::string nombre);
    void mostrarNombre();
};

#endif