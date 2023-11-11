Задача 1:

Написать программу для парсинга xml документа. Необходимо распарсить xml документ и
содержимое тегов line записать в другой документ. Название файла для записи должно
состоять из значений тегов и имеет вид: <firstName>_<lastName>_<title>.txt

Xml документ:
<?xml version="1.0"?>
<sonnet type="Shakespearean">
<author>
<lastName>Shakespeare</lastName>
<firstName>William</firstName>
<nationality>British</nationality>
<yearOfBirth>1564</yearOfBirth>
<yearOfDeath>1616</yearOfDeath>
</author>
<title>Sonnet_130</title>
<lines>
<line>My mistress' eyes are nothing like the sun,</line>
<line>Coral is far more red than her lips red.</line>
<line>If snow be white, why then her breasts are dun,</line>
<line>If hairs be wires, black wires grow on her head.</line>
<line>I have seen roses damasked, red and white,</line>
<line>But no such roses see I in her cheeks.</line>
<line>And in some perfumes is there more delight</line>
<line>Than in the breath that from my mistress reeks.</line>
<line>I love to hear her speak, yet well I know</line>
<line>That music hath a far more pleasing sound.</line>
<line>I grant I never saw a goddess go,</line>
<line>My mistress when she walks, treads on the ground.</line>
<line>And yet, by Heaven, I think my love as rare</line>
<line>As any she belied with false compare.</line>
</lines>
</sonnet>

Задача *:
Дополнительно реализовать следующий функционал: если с консоли введено значение 1
- распарсить документ с помощью SAX, если с консоли введено значение 2 - распарсить
документ с помощью DOM.