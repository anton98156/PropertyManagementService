// Получение таблицы по её id.
let table = document.getElementById('tableContainer');

// Изменение стилей если таблица найдена.
if (table) {
    table.style.border = '4px solid black';
    table.style.borderCollapse = 'collapse';
    table.style.borderSpacing = '0';
    table.style.width = '100%';
    table.style.padding = '8px';
    table.style.textAlign = 'center';

    // Получение всех строк таблицы
    const tableCells = table.querySelectorAll('td, th');
    tableCells.forEach(cell => {
    cell.style.border = '1px solid black';
    cell.style.padding = '8px';
});

    const tableRows = table.querySelectorAll('tr');
    tableRows.forEach((row, index) => {
    if (index % 2 === 0) {
    row.style.backgroundColor = 'lightGrey'; // Установка фона для четных строк
    } else {
    row.style.backgroundColor = 'darkGrey'; // Установка фона для нечетных строк
    }
});
}