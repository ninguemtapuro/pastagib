import unittest

class TestVeiculo(unittest.TestCase):
    def setUp(self):
        self.veiculo = Veiculo("Carro", "Ford", 2023, 0)

    def test_acelerar(self):
        self.veiculo.acelerar(20)
        self.assertEqual(self.veiculo.velocidade, 20)

    def test_frear(self):
        self.veiculo.acelerar(50)
        self.veiculo.frear(20)
        self.assertEqual(self.veiculo.velocidade, 30)

    def test_parar(self):
        self.veiculo.acelerar(50)
        self.veiculo.parar()
        self.assertEqual(self.veiculo.velocidade, 0)

if _name_ == "_main_":
    unittest.main()


class Veiculo:
    def _init_(self, tipo, marca, ano, velocidade):
        self.tipo = tipo
        self.marca = marca
        self.ano = ano
        self.velocidade = velocidade

    def acelerar(self, incremento):
        self.velocidade += incremento

    def frear(self, decremento):
        self.velocidade -= decremento
        if self.velocidade < 0:
            self.velocidade = 0

    def parar(self):
        self.velocidade = 0