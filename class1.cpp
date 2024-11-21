#include "class1.h"

Gato::Gato(std::string nombre) {
    this->nombre = nombre;
}

void Gato::mostrarNombre() {
    std::cout << "El nombre del gato es " << this->nombre << std::endl;
}
