import axios from 'axios'
import './Home.css'
import TopMenuBar from "../../components/TopMenuBar";
import { useEffect, useState } from 'react';
import MovieLine from '../../components/MovieLine';

function App() {

    const [movies, setMovies] = useState([])

    useEffect(() => {
      const options = {
          method: 'GET',
          url: 'https://api.themoviedb.org/3/movie/now_playing',
          headers: {
            accept: 'application/json',
            Authorization: 'Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI4M2U3ZDIyMTdkMTgxY2NjNjAzYWM2NDUwYTcyMGFmNyIsInN1YiI6IjY0YjcyMjY4MWI3MjJjMDBjYmI0ZTc0ZSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.hCFLToOLd4KJL9_2qqklNWxKwxcEK4spNDhqCtLNkIo'
          }
        };
        
      axios
        .request(options)
        .then(function (response) {
            setMovies(chunkArray(response.data.results, 5));
        })
        .catch(function (error) {
            console.error(error);
      });
    }, []);

    function chunkArray(arr, chunkSize) {
      const chunkedArray = [];
      for (let i = 0; i < arr.length; i += chunkSize) {
        chunkedArray.push(arr.slice(i, i + chunkSize));
      }
      return chunkedArray;
    }
    
    // Conditional rendering while waiting for data
    if (movies.length === 0) {
      return <div>Loading...</div>;
    }

    return (
        <div>
            <TopMenuBar />
            {movies.map((movieGroup, index) => (
              <MovieLine key={index} movies={movieGroup} />
            ))}
        </div>
    )
}

export default App;