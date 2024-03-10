// Выбор видео.
const video = document.querySelector('video');

// Применение CSS стилей.
video.style.position = 'fixed';
video.style.top = '0';
video.style.left = '0';
video.style.width = '100%';
video.style.height = '100%';
video.style.overflow = 'hidden';
video.style.zIndex = '-1'; // Вывод видео на задний план.
video.style.objectFit = 'cover';