import sys

# Отримання розміру квадратної матриці від користувача
nRow = int(input("Enter size of square matrix: "))

# Отримання символу для малювання трикутника
symbol = input("Enter symbol to draw triangle: ")

# Перевірка правильності введення символу:
# має бути рівно один символ
while len(symbol) != 1:
    symbol = input("Enter correct symbol to draw triangle: ")

# Обчислення індексу центру квадратної матриці
center = nRow // 2

# Створення зубчастого масиву (списку списків)
# Спочатку всі елементи — None, згодом частина стане списками символів
arr = [None] * nRow

# Формування рядків трикутника у нижній половині матриці
for i in range(nRow):
    # Створюємо рядки тільки для індексів >= center
    if i >= center:
        level = i - center                  # відстань від центру
        lengthOfArr = 2 * level + 1         # довжина рядка трикутника
        arr[i] = [symbol] * lengthOfArr     # заповнення рядка символами

# Відкриття файлу для запису результату
with open("MyFile.txt", "w") as fout:
    for i in range(nRow):

        # Якщо рядок містить символи трикутника
        if arr[i] is not None:
            level = i - center
            numOfSpaces = center - level    # кількість пробілів для центрування

            # Початкові пробіли зміщують трикутник до центру
            line = " " * numOfSpaces

            # Додавання символів із зубчастого масиву
            line += "".join(arr[i])

        else:
            # Порожній рядок (у верхній частині)
            line = ""

        # Виведення результату на екран
        print(line)

        # Запис рядка у файл
        fout.write(line + "\n")