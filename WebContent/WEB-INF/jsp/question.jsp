<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問合せフォームもどき</title>
</head>
<body>
<form action="/example2/testenq" method="post">
名前<input type="text" name="name"><br>
<label for="qtype">お問い合わせ内容</label>
<select id="qtype" name="qtype">
<option value="company">会社について</option>
<option value="product">製品について</option>
<option value="support">アフターサポートについて</option>
</select><br>
<label for="question">お問い合わせ</label>
<textarea id="question" name="question" placeholder="お問い合わせ内容をご記入ください"></textarea>
<input type="submit" value="送信">
</form>
</body>
</html>