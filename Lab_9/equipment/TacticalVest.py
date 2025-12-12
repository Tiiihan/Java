# Клас TacticalVest описує тактичний жилет

class TacticalVest:
    def __init__(self, weight, size):
        self.weight = weight
        self.size = size

    def show_info(self):
        print("Tactical vest")
        print(f"\tSize: {self.size}, Weight: {self.weight}")