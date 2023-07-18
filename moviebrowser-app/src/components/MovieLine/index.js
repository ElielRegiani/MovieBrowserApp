import Card from '../Card'
import './MovieLine.css'

const MovieLine = (props) => {
    return (
        <div className='movieline'>
            {props.cards.map(card => <Card movieName={card.movieName} genre={card.genre} rating={card.rating}/>)}
        </div>
    )
}

export default MovieLine