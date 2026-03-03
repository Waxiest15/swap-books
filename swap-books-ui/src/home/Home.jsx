import React from 'react'
import { useEffect, useState } from 'react';


const Home = () => {

    const [books, setBooks] = useState([]);

  useEffect(() => {
    fetch("/graphql", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        query: `
          query {
            getAll {
              isbn
              title
              author
              genres
              tags
              pages
              publisher
              publicationDate
              condition
              conditionDescription
              description
            }
          }
        `,
      }),
    })
      .then((res) => res.json())
      .then((data) => {
        console.log(data);
        setBooks(data.data.getAll);
      })
      .catch((err) => console.error(err));
  }, []);


  return (
    <div>
      <h1>Books</h1>
      {books.map((book) => (
        <div key={book.isbn}>
          <h3>{book.title}</h3>
          <p>{book.author}</p>
        </div>
      ))}
    </div>
  )
}

export default Home