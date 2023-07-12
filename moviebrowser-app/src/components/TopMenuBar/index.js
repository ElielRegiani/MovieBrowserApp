import Button from "../Button"
import "./TopMenuBar.css"

const TopMenuBar = () => {
    return (
        <div className="topmenubar">
            <h1>MovieBrowserApp</h1>
            <h3>Movies</h3>
            <Button name="SIGN IN" />
        </div>
    )
}

export default TopMenuBar