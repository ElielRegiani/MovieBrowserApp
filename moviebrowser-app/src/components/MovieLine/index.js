import MovieCard from './../MovieCard'
import './MovieLine.css'

const MovieLine = (props) => {

    if (!props.movies || props.movies.length === 0) {
        return ""; // Return null if there are no movies to display
    }

    return (
        <div className='movieline'>
            {props.movies.map((movie) => (
                <MovieCard key={movie.id} movie={movie} />
            ))}
        </div>
    )
}

export default MovieLine