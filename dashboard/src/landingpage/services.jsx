import React from "react";

export const Services = (props) => {
  return (
    <div id="services" className="text-center">
      <div className="container">
        <div className="section-title">
          <h2>Our Services</h2>
          <p>At Puff Lab, we specialize in crafting premium Japanese cream puffs with a delightful twist, providing an unforgettable taste experience for every occasion. From individual indulgences to catering for events, we ensure the highest quality and freshness in every bite.
          </p>
        </div>
        <div className="row">
          {props.data
            ? props.data.map((d, i) => (
                <div key={`${d.name}-${i}`} className="col-md-4">
                  {" "}
                  <img src={d.img} alt="..." className="team-img" />
                  <div className="service-desc">
                    <h3>{d.name}</h3>
                    <h4>{d.price}</h4>
                    <p>{d.text}</p>
                    <a href={`payment/${d.slug}`}>
                      <button
                        className="btn btn-custom"
                      >Buy Now
                      </button>
                    </a>
                  </div>
                </div>
              ))
            : "loading"}
        </div>
      </div>
    </div>
  );
};
