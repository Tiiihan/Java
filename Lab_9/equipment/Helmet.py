# Клас Helmet описує шолом альпініста

class Helmet:
    def __init__(self, brand, weight, size):
        self.brand = brand
        self.weight = weight
        self.size = size

    def show_info(self):
        print("Helmet")
        print(f"\tBrand: {self.brand}, size: {self.size}, weight: {self.weight}")