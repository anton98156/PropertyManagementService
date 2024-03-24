// Объявление переменных.
const mainButton = document.getElementById('mainButton');

// Метод стилизации кнопки.
function styleButton(button) {

    button.style.display = 'inline-block';
    button.style.padding = '29px 52px';
    button.style.backgroundColor = 'black';
    button.style.color = 'white';
    button.style.textDecoration = 'none';
    button.style.border = '6px solid lightGrey';
    button.style.fontSize = '16px';

    // Динамическое изменение стиля кнопки при наведении курсора на кнопку.
    button.addEventListener('mouseenter', function() {
        this.style.textShadow = '0 0 70px red'; // Свечение при наведении курсора.
        this.style.backgroundColor = 'darkGrey'; // Динамическое изменение цвета при взаимодействии с кнопкой.
    });
    button.addEventListener('mouseleave', function() {
        this.style.textShadow = 'none'; // Удаление свечения при уходе курсора.
        this.style.backgroundColor = 'black'; // Возвращение исходного цвета кнопки.
    });
}

// Вызов функции для стилизации.
styleButton(mainButton);