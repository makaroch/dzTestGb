import pytest

from main import ListCompare

compare = ListCompare()


def test_compare_positive():
    lst1 = [11, 2]
    lst2 = [1, 3]
    lst3 = []

    assert compare.compare(lst1, lst2) == "Первый список имеет большее среднее значение"
    assert compare.compare(lst3, lst2) == "Второй список имеет большее среднее значение"
    assert compare.compare(lst2, lst2) == "Средние значения равны"


def test_compare_negative():
    lst1 = ["2", 33]
    lst2 = [5, 5, 5, 5]
    with pytest.raises(TypeError):
        compare.compare(lst1, lst2)
