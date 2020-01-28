function processing(value) {
  document.getElementById('display').value += value;
}
function reset() {
  document.getElementById('display').value = '';
}
function show() {
  document.getElementById('display').value = eval(document.getElementById('display').value);
  return document.getElementById('display').value;
}
