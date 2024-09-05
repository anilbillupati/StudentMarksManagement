const form = document.querySelector('form');

form.addEventListener('submit', (event) => {
  event.preventDefault();

  const data = {
    studentName: document.getElementById('student').value,
    className: document.getElementById('class-select').value,
    section: document.getElementById('section-select').value,
    subjectMarks: {
      english: parseInt(document.getElementById('english').value),
      math: parseInt(document.getElementById('math').value),
      science: parseInt(document.getElementById('science').value),
      history: parseInt(document.getElementById('history').value),
      geography: parseInt(document.getElementById('geography').value)
    },
    additionalNotes: document.getElementById('notes').value
  };

  fetch('/add', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(data),
  })
  .then(response => response.json())
  .then(result => {
    console.log('Success:', result);
  })
  .catch(error => {
    console.error('Error:', error);
  });
});