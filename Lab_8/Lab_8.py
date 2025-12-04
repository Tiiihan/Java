import math
import struct
import sys
import os


def read_input():
    """
    Зчитує з консолі значення x.
    Повертає float або кидає ValueError при некоректному введенні.
    """
    value = input("Enter x: ")
    try:
        return float(value)
    except ValueError:
        raise ValueError("Incorrect input: x must be a number")


def calculation(x):
    """
    Обчислює значення y = sin(x - 9) / (x - cos(2x)).
    Кидає ZeroDivisionError, якщо знаменник дорівнює нулю.
    """
    denominator = x - math.cos(2 * x)
    if denominator == 0:
        raise ZeroDivisionError("Denominator cannot be zero")

    return math.sin(x - 9) / denominator


def writeResTxt(fName, result):
    """Записує результат у текстовий файл."""
    with open(fName, 'w') as f:
        f.write(str(result))


def readResTxt(fName):
    """Читає результат із текстового файлу. Повертає float."""
    if not os.path.exists(fName):
        raise FileNotFoundError(f"File {fName} not found.")

    with open(fName, 'r') as f:
        return float(f.read())


def writeResBin(fName, result):
    """Записує результат у двійковий файл."""
    with open(fName, 'wb') as f:
        f.write(struct.pack('d', result))


def readResBin(fName):
    """Читає результат із двійкового файлу. Повертає float."""
    if not os.path.exists(fName):
        raise FileNotFoundError(f"File {fName} not found.")

    with open(fName, 'rb') as f:
        return struct.unpack('d', f.read())[0]


if __name__ == "__main__":
    try:
        x = read_input()
        result = calculation(x)

        print(f"Result is: {result}")

        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)

        print("Read from BIN:", readResBin("binRes.bin"))
        print("Read from TXT:", readResTxt("textRes.txt"))

    except (ValueError, ZeroDivisionError, FileNotFoundError) as e:
        print("Error:", e)
        sys.exit(1)
