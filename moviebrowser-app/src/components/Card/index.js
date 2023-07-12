import './Card.css'

const Card = (props) => {
    return (
        <div className='card'>
            <div className='top'>
                <img src="https://github.com/ElielRegiani.png" />
            </div>
            <div className='botton'>
                <h4>{props.movieName}</h4>
                <h5>{props.genre}</h5>
                <div className='rating'>
                    {props.rating}
                </div>
            </div>
        </div>
    )
}

export default Card