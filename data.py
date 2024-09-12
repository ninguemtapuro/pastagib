import unittest

class TestData(unittest.TestCase):
    def test_data_valida(self):
        data = Data(15, 3, 2023)
        self.assertTrue(data.is_valid())

    def test_data_invalida(self):
        data = Data(32, 3, 2023)
        self.assertFalse(data.is_valid())

    def test_data_invalida_fevereiro(self):
        data = Data(30, 2, 2023)
        self.assertFalse(data.is_valid())

    def test_data_valida_ano_bissexto(self):
        data = Data(29, 2, 2024)  # 2024 é ano bissexto
        self.assertTrue(data.is_valid())

    def test_data_invalida_ano_nao_bissexto(self):
        data = Data(29, 2, 2023)  # 2023 não é ano bissexto
        self.assertFalse(data.is_valid())

if _name_ == "_main_":
    unittest.main()


class Data:
    def _init_(self, dia, mes, ano):
        self.dia = dia
        self.mes = mes
        self.ano = ano

    def is_valid(self):
        if self.mes < 1 or self.mes > 12:
            return False
        if self.dia < 1 or self.dia > 31:
            return False
        if self.mes == 2:
            if self.is_ano_bissexto():
                return self.dia <= 29
            else:
                return self.dia <= 28
        if self.mes in [4, 6, 9, 11]:
            return self.dia <= 30
        return True

    def is_ano_bissexto(self):
        return (self.ano % 4 == 0 and (self.ano % 100 != 0 or self.ano % 400 == 0))