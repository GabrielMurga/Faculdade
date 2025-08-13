
import threading
import time
import random

class Table:
    def __init__(self):
        self.forks = [threading.Lock() for _ in range(5)]

class Philosopher:
    def __init__(self, philosopher_id, table):
        self.id = philosopher_id
        self.table = table

    def spawn(self):
        t = threading.Thread(target=self.exist)
        t.start()
        return t

    def exist(self):
        while True:
            self.think()
            self.eat()

    def think(self):
        print(f"Filósofo {self.id} pensando...")
        time.sleep(random.uniform(0.5, 2))

    def eat(self):
        left = self.id
        right = (self.id + 1) % 5

        # Evita deadlock sempre travando os locks na mesma ordem (menor id primeiro)
        first = min(left, right)
        second = max(left, right)

        print(f"Filósofo {self.id} tentando pegar os garfos {first} e {second}...")

        # Lock ordenado
        with self.table.forks[first]:
            with self.table.forks[second]:
                print(f"Filósofo {self.id} comendo com os garfos {first} e {second}...")
                time.sleep(random.uniform(1, 3))
                print(f"Filósofo {self.id} devolveu os garfos {first} e {second}.")

def main():
    print("JANTAR DOS FILÓSOFOS\n")
    table = Table()
    threads = []

    for i in range(5):
        philosopher = Philosopher(i, table)
        t = philosopher.spawn()
        threads.append(t)

    for t in threads:
        t.join()

if __name__ == "__main__":
    main()
