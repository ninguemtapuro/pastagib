import unittest

class TestElevador(unittest.TestCase):
    def setUp(self):
        self.elevador = Elevador(10, 0)

    def test_subir(self):
        self.elevador.subir()
        self.assertEqual(self.elevador.andar_atual, 1)

    def test_descer(self):
        self.elevador.subir()
        self.elevador.descer()
        self.assertEqual(self.elevador.andar_atual, 0)

if _name_ == "_main_":
    unittest.main()

class Elevador:
    def _init_(self, total_andares, andar_atual):
        self.total_andares = total_andares
        self.andar_atual = andar_atual

    def subir(self):
        if self.andar_atual < self.total_andares:
            self.andar_atual += 1

    def descer(self):
        if self.andar_atual > 0:
            self.andar_atual -= 1