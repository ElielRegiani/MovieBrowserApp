import { useState } from "react";
import "./MovieType.css"
import Tab from 'react-bootstrap/Tab';
import Tabs from 'react-bootstrap/Tabs';

const MovieType = ({ onChangeTab }) => {

    const [activeTab, setActiveTab] = useState("Popular")

    const handleTabChange = (tab) => {
        setActiveTab(tab)
        onChangeTab(tab)
    }

    return (
        <Tabs
            activeKey={activeTab}
            onSelect={handleTabChange}
            defaultActiveKey="home"
            transition={false}
            id="noanim-tab-example"
            title="dark"
            className="mb-3"
            data-bs-theme="dark"
        >
        <Tab eventKey="popular" title={<span className="tab-title">Popular</span>} />
        <Tab eventKey="now_playing" title={<span className="tab-title">Now playing</span>} />
        <Tab eventKey="top_rated" title={<span className="tab-title">Top rated</span>} />
        <Tab eventKey="upcoming" title={<span className="tab-title">Upcoming</span>} />
    </Tabs>
    );
}

export default MovieType