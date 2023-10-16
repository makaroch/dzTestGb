from typing import List

'''
a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.
'''


class ListCompare:
    def _check_type_not_int_or_float(self, lst: List) -> bool:
        for item in lst:
            if not isinstance(item, int) and not isinstance(item, float):
                return True
        return False

    def _calculate_arithmetic_average(self, lst: List[int | float]) -> float:
        len_lst = len(lst)
        if len_lst == 0:
            return 0
        return sum(lst) / len_lst

    def compare(self, lst1: List[int | float], lst2: List[int | float]) -> str:
        if self._check_type_not_int_or_float(lst1) or \
                self._check_type_not_int_or_float(lst2):
            raise TypeError("Листы должны содержать только числа")

        first_average = self._calculate_arithmetic_average(lst1)
        second_average = self._calculate_arithmetic_average(lst2)

        if first_average > second_average:
            return "Первый список имеет большее среднее значение"
        if first_average < second_average:
            return "Второй список имеет большее среднее значение"
        return "Средние значения равны"
