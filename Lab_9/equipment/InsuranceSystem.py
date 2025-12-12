# Клас описує страхувальну систему альпініста

class InsuranceSystem:
    def __init__(self, brand, weight, size):
        self.brand = brand
        self.weight = weight
        self.size = size

    def show_info(self):
        print("Insurance system")
        print(f"\tBrand: {self.brand}, size: {self.size}, weight: {self.weight}")